/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DependencyGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a DependencyGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class DependencyGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected DependencyObjectData noOpIn;

/**
 *
 * Constructor to create a   DependencyGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public DependencyGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, DependencyObjectData noOpInIn) {
    super(id, context, "DependencyGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Dependency", DependencyObjectHelper.toMap(noOpIn, new HashMap(), "Dependency").get("Dependency"));
    }
  }
/**
 *
 * Sets the  Dependency
 * @param noOpInIn DependencyObjectData to set
 *
 */
  public void setDependency(DependencyObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Dependency passed into the constructor
 * @return Simulated response
 *
 */
  public DependencyObjectData getDependency() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = DependencyObjectHelper.fromMap(inputMap, "Dependency");
  }
}
