/*
 * Generated code DO NOT EDIT
 * Generated file: InvsFieldMasterUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvsFieldMasterUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsFieldMasterUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsFieldMasterObjectData IFMUpdateIn;
/**
 *
 * Constructor to create a  InvsFieldMasterUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsFieldMasterUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsFieldMasterObjectData IFMUpdateInIn) {
    super(id, context, "InvsFieldMasterUpdate");
    IFMUpdateIn = IFMUpdateInIn;
  }

  public void translateToMap() {
    if (IFMUpdateIn != null) {
      IFMUpdateIn.resetFlags(true, true);
      addInput("InvsFieldMaster", InvsFieldMasterObjectHelper.toMap(IFMUpdateIn, new HashMap(), "InvsFieldMaster").get("InvsFieldMaster"));
    }
  }


/**
 *
 * Sets the InvsFieldMaster
 * @param IFMUpdateInIn Value of the IFMUpdateIn
 *
 */

  public void setInvsFieldMaster(InvsFieldMasterObjectData IFMUpdateInIn) {
    IFMUpdateIn = IFMUpdateInIn;
  }

  public void translateFromMap() {
    IFMUpdateIn = InvsFieldMasterObjectHelper.fromMap(inputMap, "InvsFieldMaster");
  }

/**
 *
 * Gets the InvsFieldMaster
 * @return Value of the InvsFieldMaster
 *
 */

  public InvsFieldMasterObjectData getInvsFieldMaster( ) {
    return IFMUpdateIn;
  }

}
