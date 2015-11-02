/*
 * Generated code DO NOT EDIT
 * Generated file: TechnicianCreateBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a TechnicianCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class TechnicianCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected TechnicianObjectData TechnicianCreateIn;
/**
 *
 * Constructor to create a  TechnicianCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public TechnicianCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, TechnicianObjectData TechnicianCreateInIn) {
    super(id, context, "TechnicianCreate");
    TechnicianCreateIn = TechnicianCreateInIn;
  }

  public void translateToMap() {
    if (TechnicianCreateIn != null) {
      TechnicianCreateIn.resetFlags(true, true);
      addInput("Technician", TechnicianObjectHelper.toMap(TechnicianCreateIn, new HashMap(), "Technician").get("Technician"));
    }
  }


/**
 *
 * Sets the Technician
 * @param TechnicianCreateInIn Value of the TechnicianCreateIn
 *
 */

  public void setTechnician(TechnicianObjectData TechnicianCreateInIn) {
    TechnicianCreateIn = TechnicianCreateInIn;
  }

  public void translateFromMap() {
    TechnicianCreateIn = TechnicianObjectHelper.fromMap(inputMap, "Technician");
  }

/**
 *
 * Gets the Technician
 * @return Value of the Technician
 *
 */

  public TechnicianObjectData getTechnician( ) {
    return TechnicianCreateIn;
  }

}
