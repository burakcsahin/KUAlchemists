package Business;

public class DiscountArtifact extends Artifact implements removeArtifactListener {
    public int discountAmount;
    public String whereToApply;
    private String duration;
    
    public DiscountArtifact(String name, int discountAmount, String whereToApply, String duration) {
		super(name);
		this.discountAmount = discountAmount;
		this.whereToApply = whereToApply;
		this.duration = duration;
	}

	public int getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(int discountAmount) {
        this.discountAmount = discountAmount;
    }

    public String getWhereToApply() {
        return whereToApply;
    }

    public void setWhereToApply(String whereToApply) {
        this.whereToApply = whereToApply;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

	@Override
	public void applyArtifact(Player player) {
		player.setGoldtToBePayedToArtifact(-2);
	}

	@Override
	public void handleRemove(Player player) {		
		player.setGoldtToBePayedToArtifact(-3);
	}
  
}