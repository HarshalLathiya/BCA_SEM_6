from sklearn.metrics import mean_squared_error, mean_absolute_error, r2_score

actual = [2,4,5,4,6]
predicted = [2.1,3.9,4.8,4.2,5.9]

print("Mean Squared Error:",mean_absolute_error(actual,predicted))
print("Mean Absolute Error:",mean_absolute_error(actual,predicted))
print("R2 Score:",r2_score(actual,predicted))