/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxPackageInstGetNoOpRequest.java
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

/**
 *
 * NoOp class used to simulate a TaxPackageInstGetNoOpRequest Udt Request/Response
 *
 */
public class TaxPackageInstGetNoOpRequest extends TaxPackageInstSubRequestParent {
/**
 *
 * Constructor to create a   TaxPackageInstGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public TaxPackageInstGetNoOpRequest(String id, TPIObjectData noOpIn) {
    super(id, "TaxPackageInstGetNoOpRequest");
    if (noOpIn != null) {
      addInput("TaxPackageInst", TPIObjectHelper.toMap(noOpIn, new HashMap(), "TaxPackageInst").get("TaxPackageInst"));
    }
  }
/**
 *
 * Retrieves the TPIObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public TPIObjectData getOutput() {
    return TPIObjectHelper.fromMap(outputMap, "TaxPackageInst");
  }
}
