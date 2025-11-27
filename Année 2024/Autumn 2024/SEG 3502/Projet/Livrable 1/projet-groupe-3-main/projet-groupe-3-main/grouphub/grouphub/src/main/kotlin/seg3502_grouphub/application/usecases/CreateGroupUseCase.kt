package seg3502_grouphub.application.usecases

interface CreateGroupUseCase {
    fun createGroup(command: CreateGroupCommand): Group
}