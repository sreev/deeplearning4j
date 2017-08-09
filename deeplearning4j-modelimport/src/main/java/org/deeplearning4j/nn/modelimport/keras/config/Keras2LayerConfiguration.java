package org.deeplearning4j.nn.modelimport.keras.config;

import lombok.Data;

@Data()
public class Keras2LayerConfiguration extends KerasLayerConfiguration {

    private final String LAYER_FIELD_KERAS_VERSION = "keras_version";
    private final String LAYER_FIELD_CLASS_NAME = "class_name";
    private final String LAYER_CLASS_NAME_ACTIVATION = "Activation";
    private final String LAYER_CLASS_NAME_INPUT = "InputLayer";
    private final String LAYER_CLASS_NAME_DROPOUT = "Dropout";
    private final String LAYER_CLASS_NAME_DENSE = "Dense";
    private final String LAYER_CLASS_NAME_TIME_DISTRIBUTED_DENSE = "TimeDistributedDense";
    private final String LAYER_CLASS_NAME_LSTM = "LSTM";
    private final String LAYER_CLASS_NAME_CONVOLUTION_1D = "Conv1D";
    private final String LAYER_CLASS_NAME_CONVOLUTION_2D = "Conv2D";
    private final String LAYER_CLASS_NAME_MAX_POOLING_1D = "MaxPooling1D";
    private final String LAYER_CLASS_NAME_MAX_POOLING_2D = "MaxPooling2D";
    private final String LAYER_CLASS_NAME_AVERAGE_POOLING_1D = "AveragePooling1D";
    private final String LAYER_CLASS_NAME_AVERAGE_POOLING_2D = "AveragePooling2D";
    private final String LAYER_CLASS_NAME_ZERO_PADDING_1D = "ZeroPadding1D";
    private final String LAYER_CLASS_NAME_ZERO_PADDING_2D = "ZeroPadding2D";
    private final String LAYER_CLASS_NAME_FLATTEN = "Flatten";
    private final String LAYER_CLASS_NAME_MERGE = "Merge";
    private final String LAYER_CLASS_NAME_BATCHNORMALIZATION = "BatchNormalization";
    private final String LAYER_CLASS_NAME_TIME_DISTRIBUTED = "TimeDistributed";
    private final String LAYER_CLASS_NAME_EMBEDDING = "Embedding";
    private final String LAYER_CLASS_NAME_GLOBAL_MAX_POOLING_1D = "GlobalMaxPooling1D";
    private final String LAYER_CLASS_NAME_GLOBAL_MAX_POOLING_2D = "GlobalMaxPooling2D";
    private final String LAYER_CLASS_NAME_GLOBAL_AVERAGE_POOLING_1D = "GlobalAveragePooling1D";
    private final String LAYER_CLASS_NAME_GLOBAL_AVERAGE_POOLING_2D = "GlobalAveragePooling2D";

    /* Keras layer configurations. */
    private final String LAYER_FIELD_CONFIG = "config";
    private final String LAYER_FIELD_NAME = "name";
    private final String LAYER_FIELD_BATCH_INPUT_SHAPE = "batch_input_shape";
    private final String LAYER_FIELD_INBOUND_NODES = "inbound_nodes";
    private final String LAYER_FIELD_DROPOUT = "dropout";
    private final String LAYER_FIELD_DROPOUT_W = "dropout_W";
    private final String LAYER_FIELD_OUTPUT_DIM = "output_dim";
    private final String LAYER_FIELD_NB_FILTER = "nb_filter";
    private final String LAYER_FIELD_NB_ROW = "nb_row";
    private final String LAYER_FIELD_NB_COL = "nb_col";
    private final String LAYER_FIELD_POOL_SIZE = "pool_size";
    private final String LAYER_FIELD_SUBSAMPLE = "subsample";
    private final String LAYER_FIELD_STRIDES = "strides";
    private final String LAYER_FIELD_BORDER_MODE = "border_mode";

    /* Keras convolution border modes. */
    private final String LAYER_BORDER_MODE_SAME = "same";
    private final String LAYER_BORDER_MODE_VALID = "valid";
    private final String LAYER_BORDER_MODE_FULL = "full";

    /* Keras weight regularizers. */
    private final String LAYER_FIELD_W_REGULARIZER = "W_regularizer";
    private final String LAYER_FIELD_B_REGULARIZER = "b_regularizer";
    private final String REGULARIZATION_TYPE_L1 = "l1";
    private final String REGULARIZATION_TYPE_L2 = "l2";

    /* Keras weight initializers. */
    private final String LAYER_FIELD_INIT = "init";
    private final String INIT_UNIFORM = "uniform";
    private final String INIT_ZERO = "zero";
    private final String INIT_GLOROT_NORMAL = "glorot_normal";
    private final String INIT_GLOROT_UNIFORM = "glorot_uniform";
    private final String INIT_HE_NORMAL = "he_normal";
    private final String INIT_HE_UNIFORM = "he_uniform";
    private final String INIT_LECUN_UNIFORM = "lecun_uniform";
    private final String INIT_NORMAL = "normal";
    private final String INIT_ORTHOGONAL = "orthogonal";
    private final String INIT_IDENTITY = "identity";

    /* Keras and DL4J activation types. */
    private final String LAYER_FIELD_ACTIVATION = "activation";
    private final String KERAS_ACTIVATION_SOFTMAX = "softmax";
    private final String KERAS_ACTIVATION_SOFTPLUS = "softplus";
    private final String KERAS_ACTIVATION_SOFTSIGN = "softsign";
    private final String KERAS_ACTIVATION_RELU = "relu";
    private final String KERAS_ACTIVATION_TANH = "tanh";
    private final String KERAS_ACTIVATION_SIGMOID = "sigmoid";
    private final String KERAS_ACTIVATION_HARD_SIGMOID = "hard_sigmoid";
    private final String KERAS_ACTIVATION_LINEAR = "linear";

    /* Keras dimension ordering for, e.g., convolutional layersOrdered. */
    private final String LAYER_FIELD_DIM_ORDERING = "dim_ordering";
    private final String DIM_ORDERING_THEANO = "th";
    private final String DIM_ORDERING_TENSORFLOW = "tf";

    /* Keras loss functions. */
    private final String KERAS_LOSS_MEAN_SQUARED_ERROR = "mean_squared_error";
    private final String KERAS_LOSS_MSE = "mse";
    private final String KERAS_LOSS_MEAN_ABSOLUTE_ERROR = "mean_absolute_error";
    private final String KERAS_LOSS_MAE = "mae";
    private final String KERAS_LOSS_MEAN_ABSOLUTE_PERCENTAGE_ERROR = "mean_absolute_percentage_error";
    private final String KERAS_LOSS_MAPE = "mape";
    private final String KERAS_LOSS_MEAN_SQUARED_LOGARITHMIC_ERROR = "mean_squared_logarithmic_error";
    private final String KERAS_LOSS_MSLE = "msle";
    private final String KERAS_LOSS_SQUARED_HINGE = "squared_hinge";
    private final String KERAS_LOSS_HINGE = "hinge";
    private final String KERAS_LOSS_BINARY_CROSSENTROPY = "binary_crossentropy";
    private final String KERAS_LOSS_CATEGORICAL_CROSSENTROPY = "categorical_crossentropy";
    private final String KERAS_LOSS_SPARSE_CATEGORICAL_CROSSENTROPY = "sparse_categorical_crossentropy";
    private final String KERAS_LOSS_KULLBACK_LEIBLER_DIVERGENCE = "kullback_leibler_divergence";
    private final String KERAS_LOSS_KLD = "kld";
    private final String KERAS_LOSS_POISSON = "poisson";
    private final String KERAS_LOSS_COSINE_PROXIMITY = "cosine_proximity";
    private final String LAYER_FIELD_LAYER = "layer";
}