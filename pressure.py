"""Program to compute vertical pressure 
(1)at a depth of 4m below the load 
(2)at a distance of 3m at the same depth by using boussinesq's formula"""
import math

def compute_vertical_pressure(load, depth, distance):
    # Boussinesq's formula for vertical pressure
    pressure = (3 * load * depth) / (2 * math.pi * (depth**2 + distance**2)**(5/2))
    return pressure

# Example usage
load = float(input("Enter the load (in kN): "))
depth = 4  # Depth in meters
distance = 3  # Distance in meters

pressure_at_depth = compute_vertical_pressure(load, depth, 0)
pressure_at_distance = compute_vertical_pressure(load, depth, distance)

print(f"Vertical pressure at a depth of {depth}m below the load: {pressure_at_depth:.2f} kPa")
print(f"Vertical pressure at a distance of {distance}m at the same depth: {pressure_at_distance:.2f} kPa")