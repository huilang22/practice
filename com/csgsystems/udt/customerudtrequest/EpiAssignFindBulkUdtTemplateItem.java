/*
 * Generated code DO NOT EDIT
 * Generated file: EpiAssignFindBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a EpiAssignFindBulkUdtTemplateItem Bulk Template
 *
 */

public class EpiAssignFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EpiAssignObjectFilter EASSFindIn;
/**
 *
 * Constructor to create a  EpiAssignFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EpiAssignFindBulkUdtTemplateItem(String id, BSDMSessionContext context, EpiAssignObjectFilter EASSFindInIn) {
    super(id, context, "EpiAssignFind");
    EASSFindIn = EASSFindInIn;
  }

  public void translateToMap() {
    if (EASSFindIn != null) {
      Integer index =  EASSFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("EpiAssign", EpiAssignObjectHelper.toMap(EASSFindIn, new HashMap(), "EpiAssign").get("EpiAssign"));
    }
  }


/**
 *
 * Sets the EpiAssign
 * @param EASSFindInIn Value of the EASSFindIn
 *
 */

  public void setEpiAssign(EpiAssignObjectFilter EASSFindInIn) {
    EASSFindIn = EASSFindInIn;
  }

  public void translateFromMap() {
    EASSFindIn = EpiAssignObjectHelper.fromMapFilter(inputMap, "EpiAssign");
  }

/**
 *
 * Gets the EpiAssign
 * @return Value of the EpiAssign
 *
 */

  public EpiAssignObjectFilter getEpiAssign( ) {
    return EASSFindIn;
  }

}
