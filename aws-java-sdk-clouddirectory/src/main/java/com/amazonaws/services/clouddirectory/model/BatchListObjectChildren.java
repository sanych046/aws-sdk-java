/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the output of a ListObjectChildren operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/BatchListObjectChildren"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchListObjectChildren implements Serializable, Cloneable {

    /**
     * <p>
     * Reference of the object for which child objects are being listed.
     * </p>
     */
    private ObjectReference objectReference;
    /**
     * <p>
     * Token used for pagination.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Maximum number of items to be retrieved in a single call. This is an approximate number.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * Reference of the object for which child objects are being listed.
     * </p>
     * 
     * @param objectReference
     *        Reference of the object for which child objects are being listed.
     */

    public void setObjectReference(ObjectReference objectReference) {
        this.objectReference = objectReference;
    }

    /**
     * <p>
     * Reference of the object for which child objects are being listed.
     * </p>
     * 
     * @return Reference of the object for which child objects are being listed.
     */

    public ObjectReference getObjectReference() {
        return this.objectReference;
    }

    /**
     * <p>
     * Reference of the object for which child objects are being listed.
     * </p>
     * 
     * @param objectReference
     *        Reference of the object for which child objects are being listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchListObjectChildren withObjectReference(ObjectReference objectReference) {
        setObjectReference(objectReference);
        return this;
    }

    /**
     * <p>
     * Token used for pagination.
     * </p>
     * 
     * @param nextToken
     *        Token used for pagination.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Token used for pagination.
     * </p>
     * 
     * @return Token used for pagination.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Token used for pagination.
     * </p>
     * 
     * @param nextToken
     *        Token used for pagination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchListObjectChildren withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Maximum number of items to be retrieved in a single call. This is an approximate number.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of items to be retrieved in a single call. This is an approximate number.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of items to be retrieved in a single call. This is an approximate number.
     * </p>
     * 
     * @return Maximum number of items to be retrieved in a single call. This is an approximate number.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Maximum number of items to be retrieved in a single call. This is an approximate number.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of items to be retrieved in a single call. This is an approximate number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchListObjectChildren withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getObjectReference() != null)
            sb.append("ObjectReference: ").append(getObjectReference()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchListObjectChildren == false)
            return false;
        BatchListObjectChildren other = (BatchListObjectChildren) obj;
        if (other.getObjectReference() == null ^ this.getObjectReference() == null)
            return false;
        if (other.getObjectReference() != null && other.getObjectReference().equals(this.getObjectReference()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getObjectReference() == null) ? 0 : getObjectReference().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public BatchListObjectChildren clone() {
        try {
            return (BatchListObjectChildren) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}