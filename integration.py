import sympy as sp
x = sp.symbols('x')
f = sp.sin(x)**4
work = sp.integrate(f, (x, 0, sp.pi/2))
print("work done =", work)
print("Numerical value =",float(work))