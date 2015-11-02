/*
 * Generated code DO NOT EDIT
 * Generated file: InvsFieldMasterCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvsFieldMasterCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsFieldMasterCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsFieldMasterObjectData IFMCreateIn;
/**
 *
 * Constructor to create a  InvsFieldMasterCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsFieldMasterCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsFieldMasterObjectData IFMCreateInIn) {
    super(id, context, "InvsFieldMasterCreate");
    IFMCreateIn = IFMCreateInIn;
  }

  public void translateToMap() {
    if (IFMCreateIn != null) {
      IFMCreateIn.resetFlags(true, true);
      addInput("InvsFieldMaster", InvsFieldMasterObjectHelper.toMap(IFMCreateIn, new HashMap(), "InvsFieldMaster").get("InvsFieldMaster"));
    }
  }


/**
 *
 * Sets the InvsFieldMaster
 * @param IFMCreateInIn Value of the IFMCreateIn
 *
 */

  public void setInvsFieldMaster(InvsFieldMasterObjectData IFMCreateInIn) {
    IFMCreateIn = IFMCreateInIn;
  }

  public void translateFromMap() {
    IFMCreateIn = InvsFieldMasterObjectHelper.fromMap(inputMap, "InvsFieldMaster");
  }

/**
 *
 * Gets the InvsFieldMaster
 * @return Value of the InvsFieldMaster
 *
 */

  public InvsFieldMasterObjectData getInvsFieldMaster( ) {
    return IFMCreateIn;
  }

}
