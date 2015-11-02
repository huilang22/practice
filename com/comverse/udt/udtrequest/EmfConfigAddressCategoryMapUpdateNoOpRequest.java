/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EmfConfigAddressCategoryMapUpdateNoOpRequest.java
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

/**
 *
 * NoOp class used to simulate a EmfConfigAddressCategoryMapUpdateNoOpRequest Udt Request/Response
 *
 */
public class EmfConfigAddressCategoryMapUpdateNoOpRequest extends EmfConfigAddressCategoryMapSubRequestParent {
/**
 *
 * Constructor to create a   EmfConfigAddressCategoryMapUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public EmfConfigAddressCategoryMapUpdateNoOpRequest(String id, EmfConfigAddressCategoryMapObjectData noOpIn) {
    super(id, "EmfConfigAddressCategoryMapUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("EmfConfigAddressCategoryMap", EmfConfigAddressCategoryMapObjectHelper.toMap(noOpIn, new HashMap(), "EmfConfigAddressCategoryMap").get("EmfConfigAddressCategoryMap"));
    }
  }
/**
 *
 * Retrieves the EmfConfigAddressCategoryMapObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public EmfConfigAddressCategoryMapObjectData getOutput() {
    return EmfConfigAddressCategoryMapObjectHelper.fromMap(outputMap, "EmfConfigAddressCategoryMap");
  }
}
