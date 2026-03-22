import numpy as np

matrix = np.array([[1,2,3],
                  [4,5,6 ],
                  [7,8,9]])

print("Matrix:\n",matrix)

#Matrix Operation:
print("Transpose:\n",matrix.T)
print("Sum of all elements:",np.sum(matrix))
print("Mean:",np.mean(matrix))
print("Maximum:",np.max(matrix))
print("Minimum:",np.min(matrix))