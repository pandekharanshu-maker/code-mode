#Program to calculate efficiency of single phase transformer
def calculate_efficiency(output_power, input_power):
    efficiency = (output_power / input_power) * 100
    return efficiency
input_power = float(input("Enter the input power (in watts): "))
output_power = float(input("Enter the output power (in watts): "))
efficiency = calculate_efficiency(output_power, input_power)
print(f"The efficiency of the transformer is: {efficiency:.2f}%")