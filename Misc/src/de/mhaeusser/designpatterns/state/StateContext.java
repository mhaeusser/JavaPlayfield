package de.mhaeusser.designpatterns.state;

class StateContext {
    private State state;
    
    public StateContext() {
        state = new LowerCaseState();
    }

    /**
     * Sets the current state.
     * Normally only called by classes implementing the State interface.
     * @param newState the new state of this context
     */
    void setState(State newState) {
        state = newState;
    }

    public void writeName(String name) {
        state.writeName(this, name);
    }
}
