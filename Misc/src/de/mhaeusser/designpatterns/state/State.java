package de.mhaeusser.designpatterns.state;

interface State {
    void writeName(StateContext context, String name);
}
