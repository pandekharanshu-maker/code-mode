"""Assume 5 liters of oil weigh 61.80N
Calculate 1)Specific weight of oil
          2)Specific mass of oil"""
# Given data
weight = 61.80  # in Newtons
volume = 5  # in liters 
# Convert volume from liters to cubic meters
volume_m3 = volume / 1000  # 1 liter = 0.001
# 1) Specific weight (γ) = weight / volume
specific_weight = weight / volume_m3  # in N/m³
# 2) Specific mass (ρ) = weight / (volume * g)
g = 9.81  # acceleration due to gravity in m/s²
specific_mass = weight / (volume_m3 * g)  # in kg/m³
# Output results
print(f"Specific weight of oil: {specific_weight:.2f} N/m³")
print(f"Specific mass of oil: {specific_mass:.2f} kg/m³")          