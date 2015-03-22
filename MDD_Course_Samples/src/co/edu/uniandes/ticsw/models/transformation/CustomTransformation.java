package co.edu.uniandes.ticsw.models.transformation;

import com.mtcflow.engine.transformation.IExecutionInformation;
import com.mtcflow.engine.transformation.TransformationExecutor;
import com.mtcflow.model.mtc.InputModel;
import com.mtcflow.model.mtc.OutputModel;

public class CustomTransformation extends TransformationExecutor {

	public void executeTransformation(IExecutionInformation arg0) throws Exception {
		console.println("This is a message from a custom transformation named:"+transformation.getName());
		console.println("The input models are:");
		for (InputModel inModel : inputModels) {
			console.println(inModel.getModel().getName()+" at "+locator.getFile(inModel.getModel()).getAbsolutePath());
		}
		console.println("The output models are:");
		for (OutputModel outModel : outputModels) {
			console.println(outModel.getModel().getName()+" at "+locator.getFile(outModel.getModel()).getAbsolutePath());
		}
		// After executing the transformation we must notify the execution enviroment that the models are ready
		for (OutputModel outModel : outputModels) {
			executionEnvironment.modelReady(outModel.getModel(), transformation);
		}
	}

}
