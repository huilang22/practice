/*
 * Generated code DO NOT EDIT
 * Generated file: TechnicianGetBulkUdtTemplateItem.java
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
 * Class used to create a TechnicianGetBulkUdtTemplateItem Bulk Template
 *
 */

public class TechnicianGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected TechnicianObjectKeyData TechnicianGetIn;
/**
 *
 * Constructor to create a  TechnicianGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public TechnicianGetBulkUdtTemplateItem(String id, BSDMSessionContext context, TechnicianObjectKeyData TechnicianGetInIn) {
    super(id, context, "TechnicianGet");
    TechnicianGetIn = TechnicianGetInIn;
  }

  public void translateToMap() {
    if (TechnicianGetIn != null) {
      TechnicianGetIn.resetFlags(true, true);
      addInput("Technician", TechnicianObjectKeyHelper.toMap(TechnicianGetIn, new HashMap(), "TechnicianObjectKeyData").get("TechnicianObjectKeyData"));
    }
  }


/**
 *
 * Sets the Technician
 * @param TechnicianGetInIn Value of the TechnicianGetIn
 *
 */

  public void setTechnician(TechnicianObjectKeyData TechnicianGetInIn) {
    TechnicianGetIn = TechnicianGetInIn;
  }

  public void translateFromMap() {
    TechnicianGetIn = TechnicianObjectKeyHelper.fromMap(inputMap, "Technician");
  }

/**
 *
 * Gets the Technician
 * @return Value of the Technician
 *
 */

  public TechnicianObjectKeyData getTechnician( ) {
    return TechnicianGetIn;
  }

}
