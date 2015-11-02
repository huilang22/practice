/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitImportanceSequenceGetRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.cit.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CitImportanceSequenceGetRequest Udt Request
 *
 */

public class CitImportanceSequenceGetRequest extends CitImportanceSubRequestParent {
/**
 *
 * Constructor to create a  CitImportanceSequenceGetRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public CitImportanceSequenceGetRequest(@JsonProperty("RequestId") String id) {
    super(id, "CitImportanceSequenceGet");
  }

/**
 *
 * Retrieves the CitImportanceObjectKeyData that results from the CitImportanceSequenceGetRequest call
 * @return CitImportanceObjectKeyData resulting from udt call
 *
 */

  public CitImportanceObjectKeyData getOutput() {
    return CitImportanceObjectKeyHelper.fromMap(outputMap, "CitImportance");
  }
}
