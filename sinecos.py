#Input:
import sympy as sp
t = sp.symbols('t')
f = sp.sin(t)**6
energy_unit_area = sp.integrate(f, (t, 0, sp.pi/2))
print("Energy unit area =", energy_unit_area)
print("Numerical value of energy unit area =",float(energy_unit_area))
print("Amplitude =",1/energy_unit_area)
print("Numerical value of amplitude =",float(1/energy_unit_area))
  
#OUTPUT:
'''  Energy unit area = 5*pi/32
Numerical value of energy unit area = 0.4908738521234052
Amplitude = 32/(5*pi)
Numerical value of amplitude = 2.0371832715762603'''