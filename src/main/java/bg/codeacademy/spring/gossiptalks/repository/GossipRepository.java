package bg.codeacademy.spring.gossiptalks.repository;

import bg.codeacademy.spring.gossiptalks.model.Gossip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GossipRepository extends JpaRepository<Gossip,String>{

}
