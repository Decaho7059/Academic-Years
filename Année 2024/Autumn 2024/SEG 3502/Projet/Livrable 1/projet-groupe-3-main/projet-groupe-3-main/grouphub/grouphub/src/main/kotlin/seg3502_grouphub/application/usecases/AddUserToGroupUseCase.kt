package seg3502_grouphub.application.usecases

interface AddUserToGroupUseCase {
    fun addUser(groupId: String, userId: String): Boolean
}