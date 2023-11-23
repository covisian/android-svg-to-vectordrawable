package com.vector.svg2vectorandroid;

/**
 * Created by ravi on 19/12/17.
 */
public class Runner {

    public static void main(String args[]){

        if(args.length == 0){
            System.out.println("Usage: java -jar Svg2VectorAndroid-1.0.jar <SourceDirectoryPath> [<DestinationDirectoryPath>]");
            return;
        }

        String sourceDirectory = args[0];
        String destinationDirectory = args.length > 1 ? args[1] : null;

        if(null != sourceDirectory && !sourceDirectory.isEmpty()){
            SvgFilesProcessor processor = new SvgFilesProcessor(sourceDirectory, destinationDirectory);
            processor.process();
        }
    }
}
