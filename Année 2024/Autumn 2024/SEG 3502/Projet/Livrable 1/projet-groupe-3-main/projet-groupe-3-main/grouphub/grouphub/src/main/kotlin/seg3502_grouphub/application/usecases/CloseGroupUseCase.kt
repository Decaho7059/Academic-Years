package seg3502_grouphub.application.usecases

interface CloseGroupUseCase {
    fun closeGroup(groupId: String): Boolean
}