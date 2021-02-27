package bg.codeacademy.spring.gossiptalks.model;

import javax.persistence.ManyToOne;

public class Gossip {
  private String id;
  private String content;
  @ManyToOne
  private User user;

  //инджектваме user-а.
  public Gossip(User user) {
    this.user = user;
  }
}
