/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TechnicianUpdateBulkUdtTemplateItem.java
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
 * Class used to create a TechnicianUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class TechnicianUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected TechnicianObjectData TechnicianUpdateIn;
/**
 *
 * Constructor to create a  TechnicianUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public TechnicianUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, TechnicianObjectData TechnicianUpdateInIn) {
    super(id, context, "TechnicianUpdate");
    TechnicianUpdateIn = TechnicianUpdateInIn;
  }

  public void translateToMap() {
    if (TechnicianUpdateIn != null) {
      TechnicianUpdateIn.resetFlags(true, true);
      addInput("Technician", TechnicianObjectHelper.toMap(TechnicianUpdateIn, new HashMap(), "Technician").get("Technician"));
    }
  }


/**
 *
 * Sets the Technician
 * @param TechnicianUpdateInIn Value of the TechnicianUpdateIn
 *
 */

  public void setTechnician(TechnicianObjectData TechnicianUpdateInIn) {
    TechnicianUpdateIn = TechnicianUpdateInIn;
  }

  public void translateFromMap() {
    TechnicianUpdateIn = TechnicianObjectHelper.fromMap(inputMap, "Technician");
  }

/**
 *
 * Gets the Technician
 * @return Value of the Technician
 *
 */

  public TechnicianObjectData getTechnician( ) {
    return TechnicianUpdateIn;
  }

}
