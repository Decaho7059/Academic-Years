package seg3502_grouphub.application.usecases

interface RemoveUserFromGroupUseCase {
    fun removeUser(groupId: String, userId: String): Boolean
}