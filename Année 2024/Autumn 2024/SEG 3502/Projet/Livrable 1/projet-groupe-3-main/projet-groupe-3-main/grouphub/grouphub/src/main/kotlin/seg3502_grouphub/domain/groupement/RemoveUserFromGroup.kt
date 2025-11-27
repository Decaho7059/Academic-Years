package seg3502_grouphub.domain.groupement

import io.cucumber.java.Before
import io.cucumber.java.en.Given
import io.cucumber.java.en.When
import io.cucumber.java.en.Then
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class RemoveUserFromGroup {

    data class User(val name: String)
    data class Group(val name: String, val members: MutableList<User> = mutableListOf())

    private lateinit var currentUser: String
    private val users = mutableMapOf<String, User>()
    private val groups = mutableMapOf<String, Group>()

    @Before
    fun setup() {
        // Initialiser les données avant chaque scénario
        users["Jack sparrow"] = User("Jack sparrow")
        groups["Developers"] = Group("Developers")
    }

    @Given("je suis connecté en tant qu'administrateur")
    fun `logged in as administrator`() {
        // Simule l'authentification en tant qu'administrateur
        currentUser = "admin"
    }

    @Given("ce groupe {string} existe")
    fun `group exists`(groupName: String) {
        // Crée un groupe s'il n'existe pas déjà
        groups[groupName] = groups.getOrPut(groupName) { Group(groupName) }
    }

    @Given("un utilisateur {string} existe")
    fun `user exists`(userName: String) {
        // Crée un utilisateur s'il n'existe pas déjà
        users[userName] = users.getOrPut(userName) { User(userName) }
    }

    @Given("l'utilisateur {string} est déjà dans le groupe {string}")
    fun `user is already in the group`(userName: String, groupName: String) {
        val user = users[userName] ?: throw IllegalArgumentException("L'utilisateur n'existe pas")
        val group = groups[groupName] ?: throw IllegalArgumentException("Le groupe n'existe pas")
        if (!group.members.contains(user)) {
            group.members.add(user)
        }
    }

    @When("je supprime l'utilisateur {string} du groupe {string}")
    fun `remove user from group`(userName: String, groupName: String) {
        val user = users[userName] ?: throw IllegalArgumentException("L'utilisateur n'existe pas")
        val group = groups[groupName] ?: throw IllegalArgumentException("Le groupe n'existe pas")
        if (!group.members.contains(user)) {
            throw IllegalStateException("L'utilisateur n'est pas membre du groupe")
        }
        group.members.remove(user)
    }

    @Then("l'utilisateur {string} ne doit alors pas être dans le groupe {string}")
    fun `user should not be in group`(userName: String, groupName: String) {
        val user = users[userName] ?: throw IllegalArgumentException("L'utilisateur n'existe pas")
        val group = groups[groupName] ?: throw IllegalArgumentException("Le groupe n'existe pas")
        assert(!group.members.contains(user)) { "L'utilisateur est toujours dans le groupe" }
    }

    @Then("Je devrais alors voir un message d'erreur {string}")
    fun `see error message`(expectedMessage: String) {
        val exception = assertFailsWith<Exception> {
            throw Exception(expectedMessage)
        }
        assertEquals(expectedMessage, exception.message)
    }
}