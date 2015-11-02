/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementFindByServiceOrderBulkUdtTemplateItem.java
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
 * Class used to create a InvElementFindByServiceOrderBulkUdtTemplateItem Bulk Template
 *
 */

public class InvElementFindByServiceOrderBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvElementObjFilter InvFndByServiceOrderIn;
  protected String ServiceOrderId;
/**
 *
 * Constructor to create a  InvElementFindByServiceOrderBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvElementFindByServiceOrderBulkUdtTemplateItem(String id, BSDMSessionContext context, InvElementObjFilter InvFndByServiceOrderInIn, String ServiceOrderIdIn) {
    super(id, context, "InvElementFindByServiceOrder");
    InvFndByServiceOrderIn = InvFndByServiceOrderInIn;
    ServiceOrderId = ServiceOrderIdIn;
  }

  public void translateToMap() {
    if (InvFndByServiceOrderIn != null) {
      Integer index =  InvFndByServiceOrderIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvElement", InvElementObjHelper.toMap(InvFndByServiceOrderIn, new HashMap(), "InvElement").get("InvElement"));
    }
    if (ServiceOrderId != null) {
      addInput("ServiceOrderId", ServiceOrderId);
    }
  }


/**
 *
 * Sets the InvElement
 * @param InvFndByServiceOrderInIn Value of the InvFndByServiceOrderIn
 *
 */

  public void setInvElement(InvElementObjFilter InvFndByServiceOrderInIn) {
    InvFndByServiceOrderIn = InvFndByServiceOrderInIn;
  }

/**
 *
 * Sets the ServiceOrderId
 * @param ServiceOrderIdIn Value of the ServiceOrderId
 *
 */

  public void setServiceOrderId(String ServiceOrderIdIn) {
    ServiceOrderId = ServiceOrderIdIn;
  }

  public void translateFromMap() {
    InvFndByServiceOrderIn = InvElementObjHelper.fromMapFilter(inputMap, "InvElement");
    ServiceOrderId = (String)inputMap.get("ServiceOrderId");
  }

/**
 *
 * Gets the InvElement
 * @return Value of the InvElement
 *
 */

  public InvElementObjFilter getInvElement( ) {
    return InvFndByServiceOrderIn;
  }

/**
 *
 * Gets the ServiceOrderId
 * @return Value of the ServiceOrderId
 *
 */

  public String getServiceOrderId( ) {
    return ServiceOrderId;
  }

}
