import numpy as np
from sklearn.linear_model import LinearRegression

x = np.array([1,2,3,4,5]).reshape(-1,1)
y = np.array([2,4,5,4,6])

model = LinearRegression()
model.fit(x,y)

pred = model.predict(x)

print("Slope:",model.coef_)
print("Intercept:",model.intercept_)
print("Predicted Values:",pred)