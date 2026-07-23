#Program to solve electrical network (KVL and KCL)
def solve_kvl(voltage_sources, resistances):
    total_voltage = sum(voltage_sources)
    total_resistance = sum(resistances)
    current = total_voltage / total_resistance
    return current  
def solve_kcl(currents):
    total_current = sum(currents)
    return total_current
# Example usage
voltage_sources = int(input("Enter the number of voltage sources: "))
voltage_sources = [float(input(f"Enter voltage source {i+1} (in volts): ")) for i in range(voltage_sources)]
resistances = int(input("Enter the number of resistances: "))
resistances = [float(input(f"Enter resistance {i+1} (in ohms): ")) for i in range(resistances)]
current = solve_kvl(voltage_sources, resistances)
print(f"Current in the circuit: {current:.2f} A")