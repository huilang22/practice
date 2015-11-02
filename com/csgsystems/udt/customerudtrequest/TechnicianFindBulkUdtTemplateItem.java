/*
 * Generated code DO NOT EDIT
 * Generated file: TechnicianFindBulkUdtTemplateItem.java
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
 * Class used to create a TechnicianFindBulkUdtTemplateItem Bulk Template
 *
 */

public class TechnicianFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected TechnicianObjectFilter TechnicianFindIn;
/**
 *
 * Constructor to create a  TechnicianFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public TechnicianFindBulkUdtTemplateItem(String id, BSDMSessionContext context, TechnicianObjectFilter TechnicianFindInIn) {
    super(id, context, "TechnicianFind");
    TechnicianFindIn = TechnicianFindInIn;
  }

  public void translateToMap() {
    if (TechnicianFindIn != null) {
      Integer index =  TechnicianFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Technician", TechnicianObjectHelper.toMap(TechnicianFindIn, new HashMap(), "Technician").get("Technician"));
    }
  }


/**
 *
 * Sets the Technician
 * @param TechnicianFindInIn Value of the TechnicianFindIn
 *
 */

  public void setTechnician(TechnicianObjectFilter TechnicianFindInIn) {
    TechnicianFindIn = TechnicianFindInIn;
  }

  public void translateFromMap() {
    TechnicianFindIn = TechnicianObjectHelper.fromMapFilter(inputMap, "Technician");
  }

/**
 *
 * Gets the Technician
 * @return Value of the Technician
 *
 */

  public TechnicianObjectFilter getTechnician( ) {
    return TechnicianFindIn;
  }

}
