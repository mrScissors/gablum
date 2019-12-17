package com.gablum.proposals.proposal.ProposalRabbit;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface ProposalInterfaceRabbit {

    @Output("newProposal")
    MessageChannel newProposalMessageChannel();

//    @Input ("userList")
//    SubscribableChannel userListBySubDomainChannel();
}
