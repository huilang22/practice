/*
 * Generated code DO NOT EDIT
 * Generated file: PpvOutletFindBulkUdtTemplateItem.java
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
import com.csgsystems.ppv.data.*;

/**
 *
 * Class used to create a PpvOutletFindBulkUdtTemplateItem Bulk Template
 *
 */

public class PpvOutletFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PpvOutletObjectFilter FindIn;
/**
 *
 * Constructor to create a  PpvOutletFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PpvOutletFindBulkUdtTemplateItem(String id, BSDMSessionContext context, PpvOutletObjectFilter FindInIn) {
    super(id, context, "PpvOutletFind");
    FindIn = FindInIn;
  }

  public void translateToMap() {
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PpvOutlet", PpvOutletObjectHelper.toMap(FindIn, new HashMap(), "PpvOutlet").get("PpvOutlet"));
    }
  }


/**
 *
 * Sets the PpvOutlet
 * @param FindInIn Value of the FindIn
 *
 */

  public void setPpvOutlet(PpvOutletObjectFilter FindInIn) {
    FindIn = FindInIn;
  }

  public void translateFromMap() {
    FindIn = PpvOutletObjectHelper.fromMapFilter(inputMap, "PpvOutlet");
  }

/**
 *
 * Gets the PpvOutlet
 * @return Value of the PpvOutlet
 *
 */

  public PpvOutletObjectFilter getPpvOutlet( ) {
    return FindIn;
  }

}
