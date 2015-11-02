/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceOrderValidateCreateBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a ServiceOrderValidateCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceOrderValidateCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceOrderObjectBaseData[] ServiceOrderValidateCreateIn;
  protected Boolean DateBasedValidation;
  protected Date ResumeDt;
/**
 *
 * Constructor to create a  ServiceOrderValidateCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceOrderValidateCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderObjectBaseData[] ServiceOrderValidateCreateInIn, Boolean DateBasedValidationIn, Date ResumeDtIn) {
    super(id, context, "ServiceOrderValidateCreate");
    ServiceOrderValidateCreateIn = ServiceOrderValidateCreateInIn;
    DateBasedValidation = DateBasedValidationIn;
    ResumeDt = ResumeDtIn;
  }

  public void translateToMap() {
    if (ServiceOrderValidateCreateIn != null) {
      if (ServiceOrderValidateCreateIn != null) {
        Object[] list = new Object[ServiceOrderValidateCreateIn.length];
        for (int i = 0; i < ServiceOrderValidateCreateIn.length; i++) {
          list[i] = ServiceOrderObjectBaseHelper.getMap(ServiceOrderValidateCreateIn[i], (Map) list[i]);
          if (list[i] != null) ((Map) list[i]).put ("#NAME", "ServiceOrder");
        }
        addInput("ServiceOrderList", list);
      }
    }
    if (DateBasedValidation != null) {
      addInput("DateBasedValidation", DateBasedValidation);
    }
    if (ResumeDt != null) {
      addInput("ResumeDt", ResumeDt);
    }
  }


/**
 *
 * Sets the ServiceOrder
 * @param ServiceOrderValidateCreateInIn Value of the ServiceOrderValidateCreateIn
 *
 */

  public void setServiceOrder(ServiceOrderObjectBaseData[] ServiceOrderValidateCreateInIn) {
    ServiceOrderValidateCreateIn = ServiceOrderValidateCreateInIn;
  }

/**
 *
 * Sets the DateBasedValidation
 * @param DateBasedValidationIn Value of the DateBasedValidation
 *
 */

  public void setDateBasedValidation(Boolean DateBasedValidationIn) {
    DateBasedValidation = DateBasedValidationIn;
  }

/**
 *
 * Sets the ResumeDt
 * @param ResumeDtIn Value of the ResumeDt
 *
 */

  public void setResumeDt(Date ResumeDtIn) {
    ResumeDt = ResumeDtIn;
  }

  public void translateFromMap() {
    Object[] list = (Object[]) inputMap.get("ServiceOrderList");
    if (list != null) {
      ServiceOrderValidateCreateIn = new ServiceOrderObjectBaseData[list.length];
      for (int i = 0; i < list.length; i++) {
        ServiceOrderValidateCreateIn[i] = ServiceOrderObjectBaseHelper.getObj((Map) list[i]);
        ServiceOrderValidateCreateIn[i].resetFlags(true, true);
      }
    }
    DateBasedValidation = (Boolean)inputMap.get("DateBasedValidation");
    ResumeDt = (Date)inputMap.get("ResumeDt");
  }

/**
 *
 * Gets the ServiceOrder
 * @return Value of the ServiceOrder
 *
 */

  public ServiceOrderObjectBaseData[] getServiceOrder( ) {
    return ServiceOrderValidateCreateIn;
  }

/**
 *
 * Gets the DateBasedValidation
 * @return Value of the DateBasedValidation
 *
 */

  public Boolean getDateBasedValidation( ) {
    return DateBasedValidation;
  }

/**
 *
 * Gets the ResumeDt
 * @return Value of the ResumeDt
 *
 */

  public Date getResumeDt( ) {
    return ResumeDt;
  }

}
