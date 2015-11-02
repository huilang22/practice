/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsFieldMasterDeleteBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvsFieldMasterDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsFieldMasterDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsFieldMasterObjectKeyData IFMDeleteIn;
/**
 *
 * Constructor to create a  InvsFieldMasterDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsFieldMasterDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsFieldMasterObjectKeyData IFMDeleteInIn) {
    super(id, context, "InvsFieldMasterDelete");
    IFMDeleteIn = IFMDeleteInIn;
  }

  public void translateToMap() {
    if (IFMDeleteIn != null) {
      IFMDeleteIn.resetFlags(true, true);
      addInput("InvsFieldMaster", InvsFieldMasterObjectKeyHelper.toMap(IFMDeleteIn, new HashMap(), "InvsFieldMasterObjectKeyData").get("InvsFieldMasterObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsFieldMaster
 * @param IFMDeleteInIn Value of the IFMDeleteIn
 *
 */

  public void setInvsFieldMaster(InvsFieldMasterObjectKeyData IFMDeleteInIn) {
    IFMDeleteIn = IFMDeleteInIn;
  }

  public void translateFromMap() {
    IFMDeleteIn = InvsFieldMasterObjectKeyHelper.fromMap(inputMap, "InvsFieldMaster");
  }

/**
 *
 * Gets the InvsFieldMaster
 * @return Value of the InvsFieldMaster
 *
 */

  public InvsFieldMasterObjectKeyData getInvsFieldMaster( ) {
    return IFMDeleteIn;
  }

}
