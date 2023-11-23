package com.vector.svg2vectorandroid;

/**
 * Created by ravi on 19/12/17.
 */
public class Runner {

    public static void main(String args[]){

        if(args.length == 0){
            System.out.println(" Provide source directory as first arguement for svg files to be converted\n example: java -jar Svg2VectorAndroid-1.0.jar <SourceDirectoryPath> <DestinationDirectoryPath>  ");
            return;
        }

        String sourceDirectory = args[0];
        String destinationDirectory = args[1];

        if(null != sourceDirectory && !sourceDirectory.isEmpty()){
            SvgFilesProcessor processor = new SvgFilesProcessor(sourceDirectory, destinationDirectory);
            processor.process();
        }
    }
}
