/*
 * Generated code DO NOT EDIT
 * Generated file: NrcFindByServiceOrderBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a NrcFindByServiceOrderBulkUdtTemplateItem Bulk Template
 *
 */

public class NrcFindByServiceOrderBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NrcObjectBaseFilter NrcFindByServiceOrderIn;
  protected Boolean ____viewable_only;
  protected String ServiceOrderId;
/**
 *
 * Constructor to create a  NrcFindByServiceOrderBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NrcFindByServiceOrderBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcObjectBaseFilter NrcFindByServiceOrderInIn, Boolean ____viewable_onlyIn, String ServiceOrderIdIn) {
    super(id, context, "NrcFindByServiceOrder");
    NrcFindByServiceOrderIn = NrcFindByServiceOrderInIn;
    ____viewable_only = ____viewable_onlyIn;
    ServiceOrderId = ServiceOrderIdIn;
  }

  public void translateToMap() {
    if (NrcFindByServiceOrderIn != null) {
      Integer index =  NrcFindByServiceOrderIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Nrc", NrcObjectBaseHelper.toMap(NrcFindByServiceOrderIn, new HashMap(), "Nrc").get("Nrc"));
    }
    if (____viewable_only != null) {
      addInput("ViewableOnly", ____viewable_only);
    }
    if (ServiceOrderId != null) {
      addInput("ServiceOrderId", ServiceOrderId);
    }
  }


/**
 *
 * Sets the Nrc
 * @param NrcFindByServiceOrderInIn Value of the NrcFindByServiceOrderIn
 *
 */

  public void setNrc(NrcObjectBaseFilter NrcFindByServiceOrderInIn) {
    NrcFindByServiceOrderIn = NrcFindByServiceOrderInIn;
  }

/**
 *
 * Sets the ViewableOnly
 * @param ____viewable_onlyIn Value of the ____viewable_only
 *
 */

  public void setViewableOnly(Boolean ____viewable_onlyIn) {
    ____viewable_only = ____viewable_onlyIn;
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
    NrcFindByServiceOrderIn = NrcObjectBaseHelper.fromMapFilter(inputMap, "Nrc");
    ____viewable_only = (Boolean)inputMap.get("ViewableOnly");
    ServiceOrderId = (String)inputMap.get("ServiceOrderId");
  }

/**
 *
 * Gets the Nrc
 * @return Value of the Nrc
 *
 */

  public NrcObjectBaseFilter getNrc( ) {
    return NrcFindByServiceOrderIn;
  }

/**
 *
 * Gets the ViewableOnly
 * @return Value of the ViewableOnly
 *
 */

  public Boolean getViewableOnly( ) {
    return ____viewable_only;
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
