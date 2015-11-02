/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementFindPendingExtendedDataBulkUdtTemplateItem.java
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
 * Class used to create a InvElementFindPendingExtendedDataBulkUdtTemplateItem Bulk Template
 *
 */

public class InvElementFindPendingExtendedDataBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvElementObjData InvFndPEIn;
  protected String WpJobId;
/**
 *
 * Constructor to create a  InvElementFindPendingExtendedDataBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvElementFindPendingExtendedDataBulkUdtTemplateItem(String id, BSDMSessionContext context, InvElementObjData InvFndPEInIn, String WpJobIdIn) {
    super(id, context, "InvElementFindPendingExtendedData");
    InvFndPEIn = InvFndPEInIn;
    WpJobId = WpJobIdIn;
  }

  public void translateToMap() {
    if (InvFndPEIn != null) {
      InvFndPEIn.resetFlags(true, true);
      addInput("InvElement", InvElementObjHelper.toMap(InvFndPEIn, new HashMap(), "InvElementPendingExtendedData").get("InvElementPendingExtendedData"));
    }
    if (WpJobId != null) {
      addInput("WpJobId", WpJobId);
    }
  }


/**
 *
 * Sets the InvElement
 * @param InvFndPEInIn Value of the InvFndPEIn
 *
 */

  public void setInvElement(InvElementObjData InvFndPEInIn) {
    InvFndPEIn = InvFndPEInIn;
  }

/**
 *
 * Sets the WpJobId
 * @param WpJobIdIn Value of the WpJobId
 *
 */

  public void setWpJobId(String WpJobIdIn) {
    WpJobId = WpJobIdIn;
  }

  public void translateFromMap() {
    InvFndPEIn = InvElementObjHelper.fromMap(inputMap, "InvElement");
    WpJobId = (String)inputMap.get("WpJobId");
  }

/**
 *
 * Gets the InvElement
 * @return Value of the InvElement
 *
 */

  public InvElementObjData getInvElement( ) {
    return InvFndPEIn;
  }

/**
 *
 * Gets the WpJobId
 * @return Value of the WpJobId
 *
 */

  public String getWpJobId( ) {
    return WpJobId;
  }

}
