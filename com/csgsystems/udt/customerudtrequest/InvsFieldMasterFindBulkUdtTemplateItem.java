/*
 * Generated code DO NOT EDIT
 * Generated file: InvsFieldMasterFindBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvsFieldMasterFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsFieldMasterFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsFieldMasterObjectFilter IFMFindIn;
/**
 *
 * Constructor to create a  InvsFieldMasterFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsFieldMasterFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsFieldMasterObjectFilter IFMFindInIn) {
    super(id, context, "InvsFieldMasterFind");
    IFMFindIn = IFMFindInIn;
  }

  public void translateToMap() {
    if (IFMFindIn != null) {
      Integer index =  IFMFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsFieldMaster", InvsFieldMasterObjectHelper.toMap(IFMFindIn, new HashMap(), "InvsFieldMaster").get("InvsFieldMaster"));
    }
  }


/**
 *
 * Sets the InvsFieldMaster
 * @param IFMFindInIn Value of the IFMFindIn
 *
 */

  public void setInvsFieldMaster(InvsFieldMasterObjectFilter IFMFindInIn) {
    IFMFindIn = IFMFindInIn;
  }

  public void translateFromMap() {
    IFMFindIn = InvsFieldMasterObjectHelper.fromMapFilter(inputMap, "InvsFieldMaster");
  }

/**
 *
 * Gets the InvsFieldMaster
 * @return Value of the InvsFieldMaster
 *
 */

  public InvsFieldMasterObjectFilter getInvsFieldMaster( ) {
    return IFMFindIn;
  }

}
