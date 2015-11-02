/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TechnicianCreateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.we.data.*;

/**
 *
 * NoOp class used to simulate a TechnicianCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class TechnicianCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected TechnicianObjectData noOpIn;

/**
 *
 * Constructor to create a   TechnicianCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public TechnicianCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, TechnicianObjectData noOpInIn) {
    super(id, context, "TechnicianCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Technician", TechnicianObjectHelper.toMap(noOpIn, new HashMap(), "Technician").get("Technician"));
    }
  }
/**
 *
 * Sets the  Technician
 * @param noOpInIn TechnicianObjectData to set
 *
 */
  public void setTechnician(TechnicianObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Technician passed into the constructor
 * @return Simulated response
 *
 */
  public TechnicianObjectData getTechnician() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = TechnicianObjectHelper.fromMap(inputMap, "Technician");
  }
}
