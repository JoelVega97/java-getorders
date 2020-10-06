package com.work.orders.services;

import com.work.orders.models.Agents;
import com.work.orders.repositories.AgentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service(value = "agentservices")
public class AgentServiceImpl implements AgentServices {

    @Autowired
    AgentsRepo agntrepo;

    @Transactional

    @Override
    public Agents save(Agents agents) {
        return agntrepo.save(agents);
    }
}
