/*
 * Generated code DO NOT EDIT
 * Generated file: DocumentTypeGetBulkUdtTemplateItem.java
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
 * Class used to create a DocumentTypeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class DocumentTypeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DocumentTypeObjectKeyData DocTypeget_In;
/**
 *
 * Constructor to create a  DocumentTypeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DocumentTypeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, DocumentTypeObjectKeyData DocTypeget_InIn) {
    super(id, context, "DocumentTypeGet");
    DocTypeget_In = DocTypeget_InIn;
  }

  public void translateToMap() {
    if (DocTypeget_In != null) {
      DocTypeget_In.resetFlags(true, true);
      addInput("DocumentType", DocumentTypeObjectKeyHelper.toMap(DocTypeget_In, new HashMap(), "DocumentTypeObjectKeyData").get("DocumentTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the DocumentType
 * @param DocTypeget_InIn Value of the DocTypeget_In
 *
 */

  public void setDocumentType(DocumentTypeObjectKeyData DocTypeget_InIn) {
    DocTypeget_In = DocTypeget_InIn;
  }

  public void translateFromMap() {
    DocTypeget_In = DocumentTypeObjectKeyHelper.fromMap(inputMap, "DocumentType");
  }

/**
 *
 * Gets the DocumentType
 * @return Value of the DocumentType
 *
 */

  public DocumentTypeObjectKeyData getDocumentType( ) {
    return DocTypeget_In;
  }

}
