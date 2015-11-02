/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxTypeCommGetRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a TaxTypeCommGetRequest Udt Request
 *
 */

public class TaxTypeCommGetRequest extends TaxTypeCommSubRequestParent {
/**
 *
 * Constructor to create a  TaxTypeCommGetRequest
 * @param id Unique request name
 * @param TTCGetIn TTCObjectKeyData for TaxTypeCommGetRequest
 *
 */
@JsonCreator
  public TaxTypeCommGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("TaxTypeComm")TTCObjectKeyData TTCGetIn) {
    super(id, "TaxTypeCommGet");
    if (TTCGetIn != null) {
      addInput("TaxTypeComm", TTCObjectKeyHelper.toMap(TTCGetIn, new HashMap(), "TTCObjectKeyData").get("TTCObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the TTCObjectData that results from the TaxTypeCommGetRequest call
 * @return TTCObjectData resulting from udt call
 *
 */

  public TTCObjectData getOutput() {
    return TTCObjectHelper.fromMap(outputMap, "TaxTypeComm");
  }
}
