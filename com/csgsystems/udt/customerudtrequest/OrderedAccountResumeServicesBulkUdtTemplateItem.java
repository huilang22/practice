/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedAccountResumeServicesBulkUdtTemplateItem.java
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
 * Class used to create a OrderedAccountResumeServicesBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderedAccountResumeServicesBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountObjectData oarAccountIn;
  protected OrderObjectData oarOrderIn;
  protected Date oarResumeDt;
  protected String oarAnnotation;
  protected Boolean oarVerboseResponse;
  protected Boolean oarAutoCommitOrder;
  protected Boolean oarGenerateWorkflow;
  protected String oarJobId;
/**
 *
 * Constructor to create a  OrderedAccountResumeServicesBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderedAccountResumeServicesBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountObjectData oarAccountInIn, OrderObjectData oarOrderInIn, Date oarResumeDtIn, String oarAnnotationIn, Boolean oarVerboseResponseIn, Boolean oarAutoCommitOrderIn, Boolean oarGenerateWorkflowIn, String oarJobIdIn) {
    super(id, context, "OrderedAccountResumeServices");
    oarAccountIn = oarAccountInIn;
    oarOrderIn = oarOrderInIn;
    oarResumeDt = oarResumeDtIn;
    oarAnnotation = oarAnnotationIn;
    oarVerboseResponse = oarVerboseResponseIn;
    oarAutoCommitOrder = oarAutoCommitOrderIn;
    oarGenerateWorkflow = oarGenerateWorkflowIn;
    oarJobId = oarJobIdIn;
  }

  public void translateToMap() {
    if (oarAccountIn != null) {
      oarAccountIn.resetFlags(true, true);
      addInput("Account", AccountObjectHelper.toMap(oarAccountIn, new HashMap(), "OrderedAccountResumeServicesOutputData").get("OrderedAccountResumeServicesOutputData"));
    }
    if (oarOrderIn != null) {
      oarOrderIn.resetFlags(true, true);
      addInput("Order", OrderObjectHelper.toMap(oarOrderIn, new HashMap(), "OrderedAccountResumeServicesOutputData").get("OrderedAccountResumeServicesOutputData"));
    }
    if (oarResumeDt != null) {
      addInput("ResumeDt", oarResumeDt);
    }
    if (oarAnnotation != null) {
      addInput("Annotation", oarAnnotation);
    }
    if (oarVerboseResponse != null) {
      addInput("VerboseResponse", oarVerboseResponse);
    }
    if (oarAutoCommitOrder != null) {
      addInput("AutoCommitOrder", oarAutoCommitOrder);
    }
    if (oarGenerateWorkflow != null) {
      addInput("GenerateWorkflow", oarGenerateWorkflow);
    }
    if (oarJobId != null) {
      addInput("JobId", oarJobId);
    }
  }


/**
 *
 * Sets the Account
 * @param oarAccountInIn Value of the oarAccountIn
 *
 */

  public void setAccount(AccountObjectData oarAccountInIn) {
    oarAccountIn = oarAccountInIn;
  }

/**
 *
 * Sets the Order
 * @param oarOrderInIn Value of the oarOrderIn
 *
 */

  public void setOrder(OrderObjectData oarOrderInIn) {
    oarOrderIn = oarOrderInIn;
  }

/**
 *
 * Sets the ResumeDt
 * @param oarResumeDtIn Value of the oarResumeDt
 *
 */

  public void setResumeDt(Date oarResumeDtIn) {
    oarResumeDt = oarResumeDtIn;
  }

/**
 *
 * Sets the Annotation
 * @param oarAnnotationIn Value of the oarAnnotation
 *
 */

  public void setAnnotation(String oarAnnotationIn) {
    oarAnnotation = oarAnnotationIn;
  }

/**
 *
 * Sets the VerboseResponse
 * @param oarVerboseResponseIn Value of the oarVerboseResponse
 *
 */

  public void setVerboseResponse(Boolean oarVerboseResponseIn) {
    oarVerboseResponse = oarVerboseResponseIn;
  }

/**
 *
 * Sets the AutoCommitOrder
 * @param oarAutoCommitOrderIn Value of the oarAutoCommitOrder
 *
 */

  public void setAutoCommitOrder(Boolean oarAutoCommitOrderIn) {
    oarAutoCommitOrder = oarAutoCommitOrderIn;
  }

/**
 *
 * Sets the GenerateWorkflow
 * @param oarGenerateWorkflowIn Value of the oarGenerateWorkflow
 *
 */

  public void setGenerateWorkflow(Boolean oarGenerateWorkflowIn) {
    oarGenerateWorkflow = oarGenerateWorkflowIn;
  }

/**
 *
 * Sets the JobId
 * @param oarJobIdIn Value of the oarJobId
 *
 */

  public void setJobId(String oarJobIdIn) {
    oarJobId = oarJobIdIn;
  }

  public void translateFromMap() {
    oarAccountIn = AccountObjectHelper.fromMap(inputMap, "Account");
    oarOrderIn = OrderObjectHelper.fromMap(inputMap, "Order");
    oarResumeDt = (Date)inputMap.get("ResumeDt");
    oarAnnotation = (String)inputMap.get("Annotation");
    oarVerboseResponse = (Boolean)inputMap.get("VerboseResponse");
    oarAutoCommitOrder = (Boolean)inputMap.get("AutoCommitOrder");
    oarGenerateWorkflow = (Boolean)inputMap.get("GenerateWorkflow");
    oarJobId = (String)inputMap.get("JobId");
  }

/**
 *
 * Gets the Account
 * @return Value of the Account
 *
 */

  public AccountObjectData getAccount( ) {
    return oarAccountIn;
  }

/**
 *
 * Gets the Order
 * @return Value of the Order
 *
 */

  public OrderObjectData getOrder( ) {
    return oarOrderIn;
  }

/**
 *
 * Gets the ResumeDt
 * @return Value of the ResumeDt
 *
 */

  public Date getResumeDt( ) {
    return oarResumeDt;
  }

/**
 *
 * Gets the Annotation
 * @return Value of the Annotation
 *
 */

  public String getAnnotation( ) {
    return oarAnnotation;
  }

/**
 *
 * Gets the VerboseResponse
 * @return Value of the VerboseResponse
 *
 */

  public Boolean getVerboseResponse( ) {
    return oarVerboseResponse;
  }

/**
 *
 * Gets the AutoCommitOrder
 * @return Value of the AutoCommitOrder
 *
 */

  public Boolean getAutoCommitOrder( ) {
    return oarAutoCommitOrder;
  }

/**
 *
 * Gets the GenerateWorkflow
 * @return Value of the GenerateWorkflow
 *
 */

  public Boolean getGenerateWorkflow( ) {
    return oarGenerateWorkflow;
  }

/**
 *
 * Gets the JobId
 * @return Value of the JobId
 *
 */

  public String getJobId( ) {
    return oarJobId;
  }

}
