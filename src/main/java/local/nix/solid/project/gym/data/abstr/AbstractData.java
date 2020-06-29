package local.nix.solid.project.gym.data.abstr;

public abstract class AbstractData<T> {

    private Long id;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }
}
