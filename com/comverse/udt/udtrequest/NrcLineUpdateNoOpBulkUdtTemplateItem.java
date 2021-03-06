/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcLineUpdateNoOpBulkUdtTemplateItem.java
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

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a NrcLineUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class NrcLineUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected NrcLineObjectData noOpIn;

/**
 *
 * Constructor to create a   NrcLineUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public NrcLineUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcLineObjectData noOpInIn) {
    super(id, context, "NrcLineUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("NrcLine", NrcLineObjectHelper.toMap(noOpIn, new HashMap(), "NrcLine").get("NrcLine"));
    }
  }
/**
 *
 * Sets the  NrcLine
 * @param noOpInIn NrcLineObjectData to set
 *
 */
  public void setNrcLine(NrcLineObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the NrcLine passed into the constructor
 * @return Simulated response
 *
 */
  public NrcLineObjectData getNrcLine() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = NrcLineObjectHelper.fromMap(inputMap, "NrcLine");
  }
}
