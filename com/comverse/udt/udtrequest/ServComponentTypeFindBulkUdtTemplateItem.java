/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServComponentTypeFindBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;
import com.csgsystems.svbl.data.*;

/**
 *
 * Class used to create a ServComponentTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ServComponentTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BigInteger AddressIdIn;
  protected Integer IndustryTypeId;
  protected Date ServiceableDt;
/**
 *
 * Constructor to create a  ServComponentTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServComponentTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BigInteger AddressIdInIn, Integer IndustryTypeIdIn, Date ServiceableDtIn) {
    super(id, context, "ServComponentTypeFind");
    AddressIdIn = AddressIdInIn;
    IndustryTypeId = IndustryTypeIdIn;
    ServiceableDt = ServiceableDtIn;
  }

  public void translateToMap() {
    if (AddressIdIn != null) {
      addInput("AddressIdIn", AddressIdIn);
    }
    if (IndustryTypeId != null) {
      addInput("IndustryTypeId", IndustryTypeId);
    }
    if (ServiceableDt != null) {
      addInput("ServiceableDt", ServiceableDt);
    }
  }


/**
 *
 * Sets the AddressIdIn
 * @param AddressIdInIn Value of the AddressIdIn
 *
 */

  public void setAddressIdIn(BigInteger AddressIdInIn) {
    AddressIdIn = AddressIdInIn;
  }

/**
 *
 * Sets the IndustryTypeId
 * @param IndustryTypeIdIn Value of the IndustryTypeId
 *
 */

  public void setIndustryTypeId(Integer IndustryTypeIdIn) {
    IndustryTypeId = IndustryTypeIdIn;
  }

/**
 *
 * Sets the ServiceableDt
 * @param ServiceableDtIn Value of the ServiceableDt
 *
 */

  public void setServiceableDt(Date ServiceableDtIn) {
    ServiceableDt = ServiceableDtIn;
  }

  public void translateFromMap() {
    AddressIdIn = (BigInteger)inputMap.get("AddressIdIn");
    IndustryTypeId = (Integer)inputMap.get("IndustryTypeId");
    ServiceableDt = (Date)inputMap.get("ServiceableDt");
  }

/**
 *
 * Gets the AddressIdIn
 * @return Value of the AddressIdIn
 *
 */

  public BigInteger getAddressIdIn( ) {
    return AddressIdIn;
  }

/**
 *
 * Gets the IndustryTypeId
 * @return Value of the IndustryTypeId
 *
 */

  public Integer getIndustryTypeId( ) {
    return IndustryTypeId;
  }

/**
 *
 * Gets the ServiceableDt
 * @return Value of the ServiceableDt
 *
 */

  public Date getServiceableDt( ) {
    return ServiceableDt;
  }

}
