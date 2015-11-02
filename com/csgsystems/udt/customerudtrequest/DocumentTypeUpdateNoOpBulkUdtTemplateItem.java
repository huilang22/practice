/*
 * Generated code DO NOT EDIT
 * Generated file: DocumentTypeUpdateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a DocumentTypeUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class DocumentTypeUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected DocumentTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   DocumentTypeUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public DocumentTypeUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, DocumentTypeObjectData noOpInIn) {
    super(id, context, "DocumentTypeUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("DocumentType", DocumentTypeObjectHelper.toMap(noOpIn, new HashMap(), "DocumentType").get("DocumentType"));
    }
  }
/**
 *
 * Sets the  DocumentType
 * @param noOpInIn DocumentTypeObjectData to set
 *
 */
  public void setDocumentType(DocumentTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the DocumentType passed into the constructor
 * @return Simulated response
 *
 */
  public DocumentTypeObjectData getDocumentType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = DocumentTypeObjectHelper.fromMap(inputMap, "DocumentType");
  }
}
