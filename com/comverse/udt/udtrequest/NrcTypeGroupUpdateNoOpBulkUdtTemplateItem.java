/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcTypeGroupUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a NrcTypeGroupUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class NrcTypeGroupUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected NrcTypeGroupObjectData noOpIn;

/**
 *
 * Constructor to create a   NrcTypeGroupUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public NrcTypeGroupUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcTypeGroupObjectData noOpInIn) {
    super(id, context, "NrcTypeGroupUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("NrcTypeGroup", NrcTypeGroupObjectHelper.toMap(noOpIn, new HashMap(), "NrcTypeGroup").get("NrcTypeGroup"));
    }
  }
/**
 *
 * Sets the  NrcTypeGroup
 * @param noOpInIn NrcTypeGroupObjectData to set
 *
 */
  public void setNrcTypeGroup(NrcTypeGroupObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the NrcTypeGroup passed into the constructor
 * @return Simulated response
 *
 */
  public NrcTypeGroupObjectData getNrcTypeGroup() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = NrcTypeGroupObjectHelper.fromMap(inputMap, "NrcTypeGroup");
  }
}
