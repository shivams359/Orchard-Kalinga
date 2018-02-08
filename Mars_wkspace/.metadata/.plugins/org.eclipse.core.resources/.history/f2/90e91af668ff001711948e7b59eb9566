package com.mindtree.CandidatesConstituencies.entity;

@Entity
public class Candidates {
	
	 @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private int id;
	    
	    private String name;
	    
	    @ManyToOne
	    @JoinColumn(name="constituencyId")
	    private Constituency constituency;
	    
	    private String party;

}
