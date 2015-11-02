/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxPackageInstGetRequest.java
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
 * Class used to create a TaxPackageInstGetRequest Udt Request
 *
 */

public class TaxPackageInstGetRequest extends TaxPackageInstSubRequestParent {
/**
 *
 * Constructor to create a  TaxPackageInstGetRequest
 * @param id Unique request name
 * @param TPIGetIn TPIObjectKeyData for TaxPackageInstGetRequest
 *
 */
@JsonCreator
  public TaxPackageInstGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("TaxPackageInst")TPIObjectKeyData TPIGetIn) {
    super(id, "TaxPackageInstGet");
    if (TPIGetIn != null) {
      addInput("TaxPackageInst", TPIObjectKeyHelper.toMap(TPIGetIn, new HashMap(), "TPIObjectKeyData").get("TPIObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the TPIObjectData that results from the TaxPackageInstGetRequest call
 * @return TPIObjectData resulting from udt call
 *
 */

  public TPIObjectData getOutput() {
    return TPIObjectHelper.fromMap(outputMap, "TaxPackageInst");
  }
}
