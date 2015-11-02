/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcTransDescrGetRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a NrcTransDescrGetRequest Udt Request
 *
 */

public class NrcTransDescrGetRequest extends NrcTransDescrSubRequestParent {
/**
 *
 * Constructor to create a  NrcTransDescrGetRequest
 * @param id Unique request name
 * @param nrcGetIn NrcTransDescrObjectKeyData for NrcTransDescrGetRequest
 *
 */
@JsonCreator
  public NrcTransDescrGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("NrcTransDescr")NrcTransDescrObjectKeyData nrcGetIn) {
    super(id, "NrcTransDescrGet");
    if (nrcGetIn != null) {
      addInput("NrcTransDescr", NrcTransDescrObjectKeyHelper.toMap(nrcGetIn, new HashMap(), "NrcTransDescrObjectKeyData").get("NrcTransDescrObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the NrcTransDescrObjectData that results from the NrcTransDescrGetRequest call
 * @return NrcTransDescrObjectData resulting from udt call
 *
 */

  public NrcTransDescrObjectData getOutput() {
    return NrcTransDescrObjectHelper.fromMap(outputMap, "NrcTransDescr");
  }
}
